package net.devstudy.myphotos.service;

import net.devstudy.myphotos.exception.RetrieveSocialDataFailedException;
import net.devstudy.myphotos.model.domain.Profile;



public interface SocialService {

    Profile fetchProfile(String code) throws RetrieveSocialDataFailedException;

    String getClientId();

    default String getAuthorizeUrl() {
        throw new UnsupportedOperationException();
    }
}

