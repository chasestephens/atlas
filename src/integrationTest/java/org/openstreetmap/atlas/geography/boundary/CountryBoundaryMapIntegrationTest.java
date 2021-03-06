package org.openstreetmap.atlas.geography.boundary;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.openstreetmap.atlas.geography.atlas.Atlas;
import org.openstreetmap.atlas.geography.atlas.items.complex.boundaries.ComplexBoundaryIntegrationTestRule;

/**
 * @author matthieun
 */
public class CountryBoundaryMapIntegrationTest
{
    // Use the same rule as ComplexBoundaryIntegrationTest
    @Rule
    public final ComplexBoundaryIntegrationTestRule rule = new ComplexBoundaryIntegrationTestRule();

    @Test
    public void testCountryBoundaryMapFromAtlas()
    {
        final Atlas atlas = this.rule.getAtlas();
        final CountryBoundaryMap map = CountryBoundaryMap.fromAtlas(atlas);
        Assert.assertEquals(2, map.allCountryNames().size());
        Assert.assertEquals(
                "MULTIPOLYGON (((-75.2288309 18.3520806, -75.2336999 18.3664654, -75.2384618 18.398702, "
                        + "-75.2377069 18.4312495, -75.2322562 18.4610773, -75.222672 18.4886399, -75.2172678 18.4999677, "
                        + "-75.1993364 18.5289778, -75.1765697 18.5547196, -75.1596528 18.5688721, -75.1492275 18.5767252, "
                        + "-75.1198508 18.5933921, -75.0880291 18.6053034, -75.0546028 18.6121442, -75.0199034 18.6137166, "
                        + "-74.9832495 18.6098363, -74.952276 18.6044011, -74.9225014 18.5946192, -74.893673 18.5801641, "
                        + "-74.8681576 18.5623586, -74.8457299 18.5411084, -74.825893 18.5159259, -74.8084096 18.4854595, "
                        + "-74.7966939 18.4525742, -74.7907319 18.418, -74.790449 18.3896744, -74.7920482 18.3693394, "
                        + "-74.804815 18.320668, -74.8230994 18.285888, -74.848054 18.2551258, -74.8801877 18.2283852, "
                        + "-74.9134925 18.2093121, -74.9498941 18.1964118, -74.9941897 18.1892548, -75.0374985 18.1907252, "
                        + "-75.0814085 18.201251, -75.1219061 18.2195619, -75.1482084 18.2370322, -75.1721527 18.2582151, "
                        + "-75.1923834 18.2826809, -75.2052088 18.3013364, -75.2192144 18.3256833, -75.2288309 18.3520806)))",
                map.countryBoundary("UMI").get(0).getBoundary().toString());
    }
}
