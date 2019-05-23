package com.paynow.contactapi.dao;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import  com.paynow.contactapi.pojo.Contact;

public  interface ContactDAO extends MongoRepository<Contact,String>{
    public List<Contact> findByUserID(String userID);

}
