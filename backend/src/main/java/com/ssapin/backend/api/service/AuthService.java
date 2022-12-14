package com.ssapin.backend.api.service;

import com.ssapin.backend.api.domain.dto.response.AuthResponse;
import com.ssapin.backend.api.domain.entity.User;

public interface AuthService {
    void addAuth(User user, String refreshToken);
    void updateAuth(User user, String refreshToken);
    boolean hasAuthByRefreshToken(String refreshToken);
    AuthResponse.Reissue createReissueResponse(String refreshToken);
}
