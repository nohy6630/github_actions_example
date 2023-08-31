package com.yenoh.github_actions_example;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;

    public TestEntity test() {
        return testRepository.findById(7l)
                .orElseThrow();
    }
}
