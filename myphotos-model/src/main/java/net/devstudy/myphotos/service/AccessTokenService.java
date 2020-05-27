package net.devstudy.myphotos.service;

import net.devstudy.myphotos.exception.AccessForbiddenException;
import net.devstudy.myphotos.exception.InvalidAccessTokenException;
import net.devstudy.myphotos.model.domain.AccessToken;
import net.devstudy.myphotos.model.domain.Profile;


public interface AccessTokenService {

    AccessToken generateAccessToken(Profile profile);

    Profile findProfile(String token, Long profileId) throws AccessForbiddenException, InvalidAccessTokenException;

    void invalidateAccessToken(String token) throws InvalidAccessTokenException;

}

