package com.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
@Schema(
        name = "Response",
        description = "Schema to hold successful response information"
)
@Data
public class ResponseDto {
    @Schema(
            description = "Status code in the response"
    )
    private final String statusCode;
    @Schema(
            description = "Status message in the response"
    )
    private final String statusMsg;

    public ResponseDto(String status201, String message201) {
        this.statusCode = status201;
        this.statusMsg = message201;
    }
}