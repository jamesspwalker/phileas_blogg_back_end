package com.codeclan.example.phileas_blogg_back_end.components;

import com.codeclan.example.phileas_blogg_back_end.models.Country;
import com.codeclan.example.phileas_blogg_back_end.models.Review;
import com.codeclan.example.phileas_blogg_back_end.models.User;
import com.codeclan.example.phileas_blogg_back_end.repositories.CountryRepository.CountryRepository;
import com.codeclan.example.phileas_blogg_back_end.repositories.ReviewRepository.ReviewRepository;
import com.codeclan.example.phileas_blogg_back_end.repositories.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ReviewRepository reviewRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){

        Country greatBritain = new Country("United Kingdom of Great Britain and  Northern Ireland");
        countryRepository.save(greatBritain);

        Country afghanistan = new Country("Afghanistan");
        countryRepository.save(afghanistan);

        Country northKorea = new Country("Korea (Democratic People's Republic of");
        countryRepository.save(northKorea);

        Country myanmar = new Country("Myanmar");
        countryRepository.save(myanmar);

        Country china = new Country("China");
        countryRepository.save(china);

        User edmund = new User("Ed", "Edmund", 789);
        userRepository.save(edmund);

        User ru = new User("ru", "Ruairidh", 32);
        userRepository.save(ru);

        User james = new User("jwalker", "James", 15);
        userRepository.save(james);

        User alison = new User("squiral", "Alison", 568);
        userRepository.save(alison);

        User mateusz = new User("traveller666", "Mateusz", 300);
        userRepository.save(mateusz);

        Review review1 = new Review(afghanistan.getName(), edmund, "Bad First Impressions, but we thoroughly enjoyed our time", "We went for our honeymoon and managed to get a great deal on flights and an all inclusive resort for 10 days. However the problems started arising when we first arrived at Hamid Karzai International Airport in Kabul, we waited over 2 hours for a cab. When we finally got one, the vehicle was in a terrible condition, there was a constant rattling coming from the engine for the entirety of the 40 minute journey. When we arrived at our destination the cab driver then charged us double what the lonely planet guide book has said it would be, however there was no way to dispute it since the cab didn't have a meter. We were also thoroughly disappointed by our first impressions of the state of the hotel, the front wall on the left hand side was completely caved in, we later found out it was from an airstrike carried out by the Americans. The lobby was also in disrepair, but the staff were very pleasant and were very helpful in taking our luggage up to our room. Now for the room, it was nothing special, but it was well furnished with a large bath and even had a hair dryer. The highlight of the trip was definitely the food, they served up these kebabs with this sort of pitta bread, although it was a little spicy for the misses, the were filled to the brim with flavour and much better than we get at home in Watford. Looking back on the trip, we did enjoy our time despite our initial impressions and the bombing run on the 3rd night, however if given the chance again to visit for as good a deal as we got, we'd take it in a heartbeat, 3 stars", "2019-10-10", 4);
        reviewRepository.save(review1);

        Review review2 = new Review(greatBritain.getName(), ru, "Britain is cool", "I've lived here a while now and it's pretty cool", "2019-10-11", 4);
        reviewRepository.save(review2);

        Review review3 = new Review(afghanistan.getName(), james, "Cool Mountains", "Pretty cool mountains, that's about it", "2019-10-10", 2);
        reviewRepository.save(review3);

        Review review4 = new Review(northKorea.getName(), alison, "Wouldn't let me leave after my visit and now I'm stuck in a North Korean Detainment camp, someone help me", "Someone come save me please", "2017-09-05", 5 );
        reviewRepository.save(review4);

        Review review5 = new Review(china.getName(), mateusz, "All the stories you hear of China controlling their people are completely false, this is the most free country in the world", "China is amazing, the Chinese Communist party is amazing, they care about the people so much", "2015-04-04", 5);
        reviewRepository.save(review5);

        Review review6 = new Review(myanmar.getName(), edmund, "Same great country despite the name change", "When we last went back in the 80's it was known as Burma and we were rather surprised by the name change, but that didn't stop us having a great time. When we first went some 30 odd years ago, our 2 boys were 10 and 7, but now they have kids of their own, how time flies. It was just as lovely as it was before and we would highly recommend, lovely people, lovely weather and lovely food", "2012-01-14", 4);
        reviewRepository.save(review6);
    }
}
