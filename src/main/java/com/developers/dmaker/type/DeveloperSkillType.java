package com.developers.dmaker.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeveloperSkillType {

    BACK_END("백엔드 개발자"),
    FRONT_END("프론트엔트 개발자"),
    PULL_STACK("풀스택 개발자");

    private final String description;
}
