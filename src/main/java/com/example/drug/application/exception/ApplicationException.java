package com.example.drug.application.exception;

import com.example.drug.common.TimoException;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ApplicationException extends TimoException {
    public ApplicationException(String message) {
        super(message);
    }
}
