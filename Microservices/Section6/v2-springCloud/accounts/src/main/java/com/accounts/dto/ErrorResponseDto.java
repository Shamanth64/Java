package com.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private final String apiPath;
    @Schema(
            description = "Error code representing the error happened"
    )
    private final HttpStatus errorCode;
    @Schema(
            description = "Error message representing the error happened"
    )
    private final String errorMsg;
    @Schema(
            description = "Time representing when error happened"
    )
    private final LocalDateTime errorTime;

    public ErrorResponseDto(String description, HttpStatus httpStatus, String message, LocalDateTime now) {
        this.errorMsg = message;
        this.errorCode = httpStatus;
        this.errorTime = now;
        this.apiPath = description;
    }
}
