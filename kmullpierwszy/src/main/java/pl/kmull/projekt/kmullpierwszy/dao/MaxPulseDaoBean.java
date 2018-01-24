package pl.kmull.projekt.kmullpierwszy.dao;

import pl.kmull.projekt.kmullpierwszy.domain.Gender;

import javax.ejb.Stateless;

@Stateless
public class MaxPulseDaoBean implements MaxPulseDao {

    @Override
    public double maxPulse(Gender gender, int age) {
        if (gender.equals(Gender.MAN)) {
            return 202 - (0.55 * age);
        } else {
            return 216 - (1.09 * age);
        }
    }
}
