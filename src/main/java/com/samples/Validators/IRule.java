package com.samples.Validators;

import java.util.List;

public interface IRule {
  List<String> getValidationMessages(Object obj);
}
