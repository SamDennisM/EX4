### Description for GitHub

This Java program implements an abstract class `Robber` and a derived class `JAVAProfessionalRobber` to solve house robbing problems using various constraints:

1. Abstract Class (`Robber`):
   - Contains abstract methods for calculating the maximum money that can be robbed under different house arrangements (`RowHouses`, `RoundHouses`, `SquareHouse`, `MultiHouseBuilding`).
   - Includes concrete methods: 
     - `RobbingClass()` prints "MScAI&ML".
     - `MachineLearning()` prints "I love MachineLearning".

2. Derived Class (`JAVAProfessionalRobber`):
   - Implements algorithms for robbing houses:
     - **RowHouses:** Houses are in a row, rob adjacent houses without triggering alarms.
     - **RoundHouses:** Houses are in a circle, first and last houses are adjacent.
     - **SquareHouse:** Houses in a square arrangement, no adjacent robbing allowed.
     - **MultiHouseBuilding:** Handles multiple house types, calculates the maximum robbing amount for each type.

3. Main Class (`Main`):
   - Accepts user input for house arrangements and calculates the maximum money that can be robbed using the implemented methods.
   - Supports multiple test cases with user-friendly input prompts.

---

Key Features:
- Dynamic user input handling for custom house setups.
- Implements efficient algorithms for each robbing scenario.
- Outputs maximum amounts robbed for each test case, ensuring correctness with complex cases like circular or multi-type houses.

