package com.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer",
            example = "Shamanth"
    )
    @NotEmpty(message = "Name can not be null.")
    @Size(min = 5, max = 30, message = "The length should be between 5 and 30")
    private String name;
    @Schema(
            description = "Email of the customer",
            example = "Shamanth6402@gmail.com"
    )
    @NotEmpty(message = "Email can not be null.")
    @Email(message = "Email address should be valid")
    private String email;
    @Schema(
            description = "Mobile number of the customer",
            example = "9964754848"
    )
    @Pattern(regexp = "(^|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public AccountsDto getAccountsDto() {
        return accountsDto;
    }

    public void setAccountsDto(AccountsDto accountsDto) {
        this.accountsDto = accountsDto;
    }

}

