package com.example.ordersnotifications.api.model;

import java.util.List;

public class NotificationTemplate {

    public int templateId;
    public String templateType;
    public String subject;
    public String content;
    List<String> placeholders;
    List<String> languages;
    List<String> channels;


    public NotificationTemplate(int templateId, String templateType, String subject, String content, List<String> placeholders, List<String> languages, List<String> channels) {
        this.templateId = templateId;
        this.templateType = templateType;
        this.subject = subject;
        this.content = content;
        this.placeholders = placeholders;
        this.languages = languages;
        this.channels = channels;
    }

    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getPlaceholders() {
        return placeholders;
    }

    public void setPlaceholders(List<String> placeholders) {
        this.placeholders = placeholders;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }


    public String getTemplateDetails() {
        return "";
    }

}
