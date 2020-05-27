package net.devstudy.myphotos.service;

import java.util.List;
import net.devstudy.myphotos.exception.ObjectNotFoundException;
import net.devstudy.myphotos.model.AsyncOperation;
import net.devstudy.myphotos.model.ImageResource;
import net.devstudy.myphotos.model.OriginalImage;
import net.devstudy.myphotos.model.Pageable;
import net.devstudy.myphotos.model.SortMode;
import net.devstudy.myphotos.model.domain.Photo;
import net.devstudy.myphotos.model.domain.Profile;

public interface PhotoService {
   
    List<Photo> findProfilePhotos(Long profileId, Pageable pageable);
    
    List<Photo> findPopularPhotos(SortMode sortMode, Pageable pageable);
    
    long countAllPhotos();
    
    String viewLargePhoto(Long photoId) throws ObjectNotFoundException; 
    
    OriginalImage downloadOriginalImage(Long photoId) throws ObjectNotFoundException; 
    
    void uploadNewPhoto(Profile currentProfile, ImageResource imageResource, AsyncOperation<Photo> asyncOperation);

}
