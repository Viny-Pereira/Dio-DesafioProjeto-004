package me.dio.streaming.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationForm {

  @NotNull(message = "Fill in the field correctly.")
  @Positive(message = "The client ID must be positive.")
  private Long clientId;
}
