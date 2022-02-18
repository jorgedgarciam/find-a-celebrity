# find-a-celebrity
Find the Celebrity

- In a team of N people, a celebrity is known by everyone, but she/he doesn't know anybody.
- The solution receives a map cotaining the person with a set of people each one knows.
- Using Java Streams obtain find the celebrity.

Solution

- Obtain the set of people known by each person.
- Create a Collection and using streams filter the person who is present in all of the sets except for one(the celebrity set itself).
- Collect the values and verify if the person doesn't have a set of people known (empty or null).
- Obtain the person and send back a result.