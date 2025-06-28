package com.example;

public class ServiceHandler {
    private ApiClient apiClient;

    public ServiceHandler(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public String handle() {
        return apiClient.getResponse();
    }
}
