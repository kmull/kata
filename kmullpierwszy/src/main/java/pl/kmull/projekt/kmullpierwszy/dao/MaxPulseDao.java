package pl.kmull.projekt.kmullpierwszy.dao;

import pl.kmull.projekt.kmullpierwszy.domain.Gender;

import javax.ejb.Local;

@Local
public interface MaxPulseDao {

    public double maxPulse(Gender gender, int age);
}
