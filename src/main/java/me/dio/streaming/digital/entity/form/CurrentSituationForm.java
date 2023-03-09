package me.dio.streaming.digital.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurrentSituationForm {

  @Positive(message = "Client ID must be positive.")
  private Long clientId;

  @NotNull(message = "Fill in the field correctly.")
  @Positive(message = "${validatedValue}' must be positive.")
  private double currentPlan;

  @NotNull(message = "Fill in the field correctly.")
  @Positive(message = "${validatedValue}' must be positive.")
  private double screensNumber;
}
