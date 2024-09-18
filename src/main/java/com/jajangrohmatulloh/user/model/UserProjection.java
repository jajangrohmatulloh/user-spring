package com.jajangrohmatulloh.user.model;

import jakarta.persistence.Column;

public record UserProjection(@Column(name = "full_name") String fullName) {

}
