package com.jajangrohmatulloh.user.model;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class WebResponse {
    private List<String> DBFullNames;
}
