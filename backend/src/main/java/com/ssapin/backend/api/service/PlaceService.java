package com.ssapin.backend.api.service;

import com.ssapin.backend.api.domain.dto.request.BookmarkRequest;
import com.ssapin.backend.api.domain.dto.request.PlaceMapRequest;
import com.ssapin.backend.api.domain.dto.request.PlaceRequest;
import com.ssapin.backend.api.domain.dto.response.MapResponse;
import com.ssapin.backend.api.domain.dto.response.PlaceInfoResponse;
import com.ssapin.backend.api.domain.dto.response.PlaceMapResponse;
import com.ssapin.backend.api.domain.dto.response.PlaceResponse;
import com.ssapin.backend.api.domain.entity.Place;
import com.ssapin.backend.api.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface PlaceService {


    Long addPlaceInMap(User user, PlaceMapRequest.RegisterPlaceToMapRequest placeRequest);

    Long addPlaceInTogetherMap(User user, PlaceMapRequest.RegisterPlaceToMapRequest placeRequest);

    PlaceMapResponse.RankingResponse getListPlaceRanking(long campus);

    Long removePlaceInMap(User user, PlaceMapRequest.RemovePlaceInMapRequest removePlaceInMapRequest);

    Long removePlaceInTogetherMap(User user, PlaceMapRequest.RemovePlaceInTogethermapRequest removePlaceInTogethermapRequest);

    PlaceInfoResponse getPlaceInfo(User user, long placeId);

    PlaceMapResponse.MapListResponse getMapListInPlace(long placeId);

    Long registerBookmark(User user, BookmarkRequest bookmarkRequest);

    Long removeBookmark(User user, BookmarkRequest bookmarkRequest);

    long countPlaceByUserId(long userId);
}
