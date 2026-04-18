# Method Reference — Static Method Reference

| File | Description |
|---|---|
| [Instructor.java](Instructor.java) | Model class representing an instructor with `name`, `gender`, `age`, `onlineCourse`, `courses`, and `year_of_experince` fields |
| [InstructorDetails.java](InstructorDetails.java) | Data-provider utility that returns a pre-populated `List<Instructor>` via a static `getAll()` factory method |
| [StaticRefDemo.java](StaticRefDemo.java) | Filters instructors with ≥10 years of experience using a static method reference bound to `Predicate<Instructor>` (`StaticRefDemo::yrsofExperienceGtTen`) |
