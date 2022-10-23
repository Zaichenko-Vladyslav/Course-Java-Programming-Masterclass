package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<HeavenlyBody.Key, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();
    private static Set<HeavenlyBody> stars = new HashSet<>();

    public static void main(String[] args) {
        
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Jupiter", 4380);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.77);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Europa", 3.6);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Ganymede", 7.15);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        tempMoon = new Moon("Callisto", 17);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Saturn", 11000);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 31000);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 60200);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 90600);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets:");
        for (HeavenlyBody planet : planets) {
            System.out.println(planet);
        }

        System.out.println();

        System.out.println("Stars:");
        for (HeavenlyBody star : stars) {
            System.out.println(star);
        }

        System.out.println();

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons:");
        for (HeavenlyBody moon : moons) {
            System.out.println(moon);
        }

        System.out.println();

        System.out.println("Tests:");
        HeavenlyBody pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        HeavenlyBody earth1 = new Planet("Earth", 365);
        HeavenlyBody earth2 = new Planet("Earth", 365);
        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth1.equals(pluto));
        System.out.println(pluto.equals(earth1));

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(HeavenlyBody.makeKey("Pluto", HeavenlyBody.BodyTypes.DWARF_PLANET)));

        System.out.println();
        System.out.println("The Solar System contains:");
        for (HeavenlyBody heavenlyBody : solarSystem.values()) {
            System.out.println(heavenlyBody);
        }
    }
}