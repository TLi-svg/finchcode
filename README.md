# Birdbrain Finch Robot as an Anemometer

## Development

| Completed | Task  | Description |
|:---------:|:-----------:|:------------|
|      ✅     | Familiarize    | Learn how to: <ul><li>Connect to the robot</li><li>Understand the Java documentation</li><li>Setup a workspace and project in Java</li></ul>|
|      ✅     | 3D Model       | 3D design of a windmill was used and adapted for our specific use-case.           |
|      🚧     | Develop Code   | Create a set pulse that allows for a measured interval of windspeed according to the size of the turbine.         |

---

## Design Cycle

We quickly researched designs for a turbine, trying to experiment in [Tinkercad](https://www.tinkercad.com/) before settling on a publicly available design that we could adapt to our use. This was due to time constraints and because we felt unhappy with our personal designs.

## Interesting Code Snippets

```java
package Finch;

import Finch.*;
```

I learned what packages were, and external packages can be imported for our use. This was something I wanted to learn and this project helped me with that. I would still love to learn how projects with tools like Gradle or Maven work.

```java
  // Measure distances to be used in later calculations
  public static ArrayList<Integer> measure(int len) {
    ArrayList<Integer> distances = new ArrayList<>();
    for (int i = 0; i < len; i++) {
      distances.add(bird.getDistance());
    }

    return distances;
  }
```

This was our tool to measure the distances that would be used in our calculations for number of rotations. The Finch doesn't have a built in system so we decided to use the number of distances in an ArrayList (because the size can vary) and we would later check if the distances were too far to be in a single rotation.

## Ideas

Here are our ideas and thoughts that we had while working on the project and after.

### Motivation

Initially we started with the idea of a pinwheel, spinning depending on the speed of the Finch. This quickly evolved into a larger idea of measuring windspeed of a small 3D-printed turbine.

### Learning

Through using the Finch java library, I learned how importing and using libraries that aren't usually included in JDK works.

### Uniqueness

Other projects usually revolve around something fun and game-like while ours is a more logical tool for measuring.
