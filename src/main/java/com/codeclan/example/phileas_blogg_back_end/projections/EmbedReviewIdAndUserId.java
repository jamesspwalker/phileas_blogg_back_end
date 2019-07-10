package com.codeclan.example.phileas_blogg_back_end.projections;

import com.codeclan.example.phileas_blogg_back_end.models.Country;
import com.codeclan.example.phileas_blogg_back_end.models.Review;
import com.codeclan.example.phileas_blogg_back_end.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedReviewIdAndUserId", types = Review.class)
public interface EmbedReviewIdAndUserId {
     long getId();
     User getUser();
}
