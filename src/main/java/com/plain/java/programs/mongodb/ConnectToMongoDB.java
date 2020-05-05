package com.plain.java.programs.mongodb;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConnectToMongoDB {

	private static MongoClient mongoClient;

	public static void main(String[] args) {
		mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		MongoDatabase database = mongoClient.getDatabase("bandhamNewDB");
		MongoCollection<Document> collection = database.getCollection("myCollection");
		FindIterable<Document> results = collection.find();
		Iterator<Document> it = results.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
