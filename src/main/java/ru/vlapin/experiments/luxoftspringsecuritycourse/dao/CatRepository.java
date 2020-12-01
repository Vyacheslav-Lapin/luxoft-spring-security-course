package ru.vlapin.experiments.luxoftspringsecuritycourse.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.experiments.luxoftspringsecuritycourse.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
