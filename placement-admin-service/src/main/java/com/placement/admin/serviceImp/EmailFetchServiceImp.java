package com.placement.admin.serviceImp;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.Message;
import com.google.api.services.gmail.model.MessagePartHeader;
import com.placement.admin.dto.ResponseDTO;
import com.placement.admin.entity.EmailEntity;
import com.placement.admin.repository.EmailFetchRepo;
import com.placement.admin.service.EmailFetchService;

@Service
public class EmailFetchServiceImp implements EmailFetchService
{

	
	
	@Autowired
	EmailFetchRepo emailfetchrepo;
	
	public ResponseDTO fetchJobEmails() {
	    ResponseDTO responseDTO = new ResponseDTO();
	    StringBuilder compileError = new StringBuilder();

	    try {
	        List<EmailEntity> emailList = emailfetchrepo.findAll();
	        JSONObject finalemailObject = new JSONObject();
	        JSONArray resultArray = new JSONArray();

	        for (EmailEntity email : emailList) {
	            JSONObject emailObject = new JSONObject();
	            emailObject.put("id", email.getId());
	            emailObject.put("mailId", email.getMailId());
	            emailObject.put("subject", email.getSubject());
	            emailObject.put("senderId", email.getSenderId());
	            emailObject.put("content", new String(email.getContent())); // Assuming content is stored as a byte array

	            // Split links by newline and convert to a JSONArray
	            String links = email.getLinks();
	            JSONArray linksArray = new JSONArray();
	            if (links != null && !links.isEmpty()) {
	                String[] linkList = links.split("\n"); // Split by newline
	                for (String link : linkList) {
	                    linksArray.add(link.trim()); // Trim each link and add to the array
	                }
	            }
	            emailObject.put("links", linksArray); // Add the list of links as a JSONArray

	            resultArray.add(emailObject);
	        }

	        finalemailObject.put("data", resultArray);
	        responseDTO.setOutput(1); // Indicates success
	        responseDTO.setResult(finalemailObject);
	        responseDTO.setPassed("true");
	        responseDTO.setCompileError(compileError);
	    } catch (Exception e) {
	        compileError.append("Error fetching emails: ").append(e.getMessage());
	        responseDTO.setOutput(0); // Indicates failure
	        responseDTO.setResult(new JSONObject());
	        responseDTO.setPassed("false");
	        responseDTO.setCompileError(compileError);
	    }

	    return responseDTO;
	}
	

	
}
