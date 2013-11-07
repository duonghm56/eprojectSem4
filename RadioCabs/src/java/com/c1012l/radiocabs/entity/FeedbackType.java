package com.c1012l.radiocabs.entity;
// Generated Nov 7, 2013 1:20:29 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * FeedbackType generated by hbm2java
 */
public class FeedbackType  implements java.io.Serializable {


     private int feedbackTypeId;
     private Serializable feedbackTypeName;
     private Set<Feedback> feedbacks = new HashSet<Feedback>(0);

    public FeedbackType() {
    }

	
    public FeedbackType(int feedbackTypeId, Serializable feedbackTypeName) {
        this.feedbackTypeId = feedbackTypeId;
        this.feedbackTypeName = feedbackTypeName;
    }
    public FeedbackType(int feedbackTypeId, Serializable feedbackTypeName, Set<Feedback> feedbacks) {
       this.feedbackTypeId = feedbackTypeId;
       this.feedbackTypeName = feedbackTypeName;
       this.feedbacks = feedbacks;
    }
   
    public int getFeedbackTypeId() {
        return this.feedbackTypeId;
    }
    
    public void setFeedbackTypeId(int feedbackTypeId) {
        this.feedbackTypeId = feedbackTypeId;
    }
    public Serializable getFeedbackTypeName() {
        return this.feedbackTypeName;
    }
    
    public void setFeedbackTypeName(Serializable feedbackTypeName) {
        this.feedbackTypeName = feedbackTypeName;
    }
    public Set<Feedback> getFeedbacks() {
        return this.feedbacks;
    }
    
    public void setFeedbacks(Set<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }




}


