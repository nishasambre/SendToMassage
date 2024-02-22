package com.massage.service;

import org.springframework.util.MultiValueMap;

import com.message.entity.SMS;
//import com.pixeltrice.springbootOTPapp.SmsPojo;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSService {
	private final String ACCOUNT_SID ="Enter the Account Sid of Twilio";

    private final String AUTH_TOKEN = "Enter the Auth Token generated from Twilio";

    private final String FROM_NUMBER = "Enter the mobile number generated from Twilio";

    public void send1(SMS sms) {
    	Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message.creator(new PhoneNumber(sms.getTo()), new PhoneNumber(FROM_NUMBER), sms.getMessage())
                .create();
        System.out.println("here is my id:"+message.getSid());// Unique resource ID created to manage this transaction

    }

    public void receive(MultiValueMap<String, String> smscallback) {
    }

	public void receive1(MultiValueMap<String, String> map) {
		// TODO Auto-generated method stub
		
	}

	/*public void (SMS sms) {
		// TODO Auto-generated method stub
		
	}*/

	public void send(SMS sms) {
		// TODO Auto-generated method stub
		
	}

}



