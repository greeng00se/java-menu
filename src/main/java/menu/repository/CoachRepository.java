package menu.repository;

import java.util.ArrayList;
import java.util.List;
import menu.domain.Coach;

public class CoachRepository {

    private static final List<Coach> repository = new ArrayList<>();

    public void saveAll(List<Coach> coaches) {
        repository.addAll(coaches);
    }
}
