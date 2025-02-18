package com.placement.admin.service;

import java.io.IOException;

import com.google.api.services.gmail.Gmail;
import com.placement.admin.dto.ResponseDTO;

public interface EmailFetchService 
{
	public ResponseDTO fetchJobEmails();

}
