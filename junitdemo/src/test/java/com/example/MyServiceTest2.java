package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MyServiceTest2 {

    @Test
    public void testVerifyApiCall() {
        // Step 1: Create a mock
        ApiClient mockClient = mock(ApiClient.class);

        // Step 2: Stub the method
        when(mockClient.getResponse()).thenReturn("Mock Response");

        // Step 3: Inject mock into the service
        ServiceHandler handler = new ServiceHandler(mockClient);
        String result = handler.handle();

        // Step 4: Assert the result
        assertEquals("Mock Response", result);

        // Step 5: Verify the interaction
        verify(mockClient).getResponse();
    }
}
