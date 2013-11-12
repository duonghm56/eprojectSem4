package com.c1012l.radiocabs.entity;
// Generated Nov 12, 2013 4:44:31 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * FeedbackType generated by hbm2java
 */
public class FeedbackType  implements java.io.Serializable {


     private int feedbackTypeId;
     private String feedbackTypeName;
     private Set feedbacks = new HashSet(0);

    public FeedbackType() {
    }

	
    public FeedbackType(int feedbackTypeId, String feedbackTypeName) {
        this.feedbackTypeId = feedbackTypeId;
        this.feedbackTypeName = feedbackTypeName;
    }
    public FeedbackType(int feedbackTypeId, String feedbackTypeName, Set feedbacks) {
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
    public String getFeedbackTypeName() {
        return this.feedbackTypeName;
    }
    
    public void setFeedbackTypeName(String feedbackTypeName) {
        this.feedbackTypeName = feedbackTypeName;
    }
    public Set getFeedbacks() {
        return this.feedbacks;
    }
    
    public void setFeedbacks(Set feedbacks) {
        this.feedbacks = feedbacks;
    }




}


