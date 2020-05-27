package net.devstudy.myphotos.service;

import java.util.Optional;
import net.devstudy.myphotos.exception.ObjectNotFoundException;
import net.devstudy.myphotos.model.AsyncOperation;
import net.devstudy.myphotos.model.ImageResource;
import net.devstudy.myphotos.model.domain.Profile;


public interface ProfileService {

    Profile findById(Long id) throws ObjectNotFoundException;

    Profile findByUid(String uid) throws ObjectNotFoundException;

    Optional<Profile> findByEmail(String email);

    void signUp(Profile profile, boolean uploadProfileAvatar);

    void translitSocialProfile(Profile profile);

    void update(Profile profile);

    void uploadNewAvatar(Profile currentProfile, ImageResource imageResource, AsyncOperation<Profile> asyncOperation);

}
