## Top ranking

- **Time limit per test:** 5 seconds
- **Memory limit per test:** 256 megabytes
- **Input:** standard input
- **Output:** standard output

You are given an unsorted list of players with their scores in a video game. Build a highscore leadership table.

You must implement the main algorithm as a separate function and invoke it from `main()`. The main algorithm should take an input array and the maximum size of the leadership table. The algorithm should then return a new array with top rankings. More generic implementations are welcome.

### Input

First line contains a number of entries N (0 ≤ N ≤ 10^6) and the maximum size of the leadership table K (1 ≤ K ≤ 100). Each of the next N lines has the format `<PLAYER> <SCORE>`, where:

- `<PLAYER>` is a single word consisting of alphanumeric symbols (a-z and A-Z), numbers (0-9), and an underscore (_);
- `<SCORE>` is a non-negative integer, up to 2^20.

### Output

The output must contain K lines, each of which contains a `<PLAYER> <SCORE>` line. The lines in the output must be sorted according to descending score.

#### Examples

**Input:**
6 3
Luffgirl 123
Cut3_Sugarr 234
Sw33t_Sparrow 789
Th3_Inn3r_Thing 678
3tiolat3 456
Luciform 567

**Output:**
Sw33t_Sparrow 789
Th3_Inn3r_Thing 678
Luciform 567

**Input:**
10 53
Cooki3_Ang3l102 152608
Posirippl397 694042
Aw3som3_Chocolat375 700664
Mind_Light94 544794
Apropos43 524660
Import3d_S3ns363 321758
Lov3stump107 116993
Star_B3lt99 868279
3tiolat33 140524
Cooki3_Ang3l105 294102

**Output:**
Star_B3lt99 868279
Aw3som3_Chocolat375 700664
Posirippl397 694042
Mind_Light94 544794
Apropos43 524660
Import3d_S3ns363 321758
Cooki3_Ang3l105 294102
Cooki3_Ang3l102 152608
3tiolat33 140524
Lov3stump107 116993
