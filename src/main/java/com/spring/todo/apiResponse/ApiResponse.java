package com.spring.todo.apiResponse;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.List;
import lombok.*;

@Getter @Setter
@RequiredArgsConstructor
public abstract class ApiResponse<T> {
    @NonNull private T data;
    private List<String> errors;
}


