package net.devstudy.myphotos.service;

import net.devstudy.myphotos.exception.ObjectNotFoundException;
import net.devstudy.myphotos.model.domain.Profile;


public interface ProfileSignUpService {

    void createSignUpProfile(Profile profile);

    Profile getCurrentProfile() throws ObjectNotFoundException;

    void completeSignUp();

    void cancel();
}
