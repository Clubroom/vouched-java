package io.github.vouched;

import java.util.List;

public class CrossCheckIdentityEmail{
  public List<VouchedError> errors;
  public List<VouchedError> warnings;
  public Boolean isValid;
  public Boolean isMatch;
  public String name;
  public CrossCheckAgeRange ageRange;
  public Boolean isAutoGenerated;
  public Boolean isDisposable;
  public Integer daysFirstSeen;
}

