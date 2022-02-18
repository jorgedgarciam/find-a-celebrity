import Models.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Celebrity {
    public Person find(Map<Person, Set<Person>> celebrityTeam) {
        List<Person> CelebrityList = new ArrayList<Person>();
        /**
         * peopleKnown is the new list that will contain all the people known by the whole celebrityTeam
         */
        List<Person> peopleKnown = new ArrayList<>();
        celebrityTeam
                .values()
                .forEach(i -> peopleKnown.addAll(i));

        /**
         * Since peopleKnown contains all the repeated values, using streams we will filter
         * to find the value that is repeated in all the celebrityTeam except for the celebrity
         */
        peopleKnown
                .stream()
                .filter(i -> Collections
                        .frequency(peopleKnown, i) == celebrityTeam.size() - 1)
                .collect(Collectors.toSet())
                .stream()
                .filter(p -> celebrityTeam.get(p) == null || celebrityTeam.get(p).size() == 0)
                .collect(Collectors.toList())
                .forEach(c -> CelebrityList.add(c));

        return CelebrityList.get(0);
    }

}
