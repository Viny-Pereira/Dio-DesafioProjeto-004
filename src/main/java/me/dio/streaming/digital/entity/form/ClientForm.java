package me.dio.streaming.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientForm {

  @NotEmpty(message = "Fill in the field correctly.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' need to be between {min} and {max} characters.")
  private String name;

  @NotEmpty(message = "Fill in the field correctly..")
  // @CPF(message = "'${validatedValue}' is invalid!")
  private String cpf;

  @NotEmpty(message = "Fill in the field correctly..")
  @Size(min = 3, max = 50, message = "'${validatedValue}' need to be between {min} and {max} characters.")
  private String country;

  @NotNull(message = "Fill in the field correctly.")
  @Past(message = "Date '${validatedValue}' is invalid.")
  private LocalDate birthDate;
}
