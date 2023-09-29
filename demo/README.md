# HRMS Services

 # (Story)
/************************/
1. Create a HRMS service with the following fields:
- empid (UUID)
- fullname (string)
- designation (string)
- mobile (string)
  -email(string)
- dateOfBirth (Date)
2.
  Data Validations:
- fullname cannot be empty
- designation cannot be empty
- email cannot be empty
- mobile cannot be empty
- dateOfBirth should be a paste date
  Return bad request on validation error