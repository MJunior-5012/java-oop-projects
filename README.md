# Java, one exercise at a time

I'm Mike, a Computer Science for Cyber Security student at Oxford Brookes. This collection follows my Java practice from small console problems to classes, interfaces, inheritance and a Swing application.

The most interesting part for me is seeing how the design changes as a program grows: a loop can solve a small puzzle, but a flowchart needs different node types that share a common interface.

## Start here

| Folder | What it does | Concepts |
| --- | --- | --- |
| `flowchart` | Walk through a connection troubleshooting decision | Abstract classes, inheritance, branching |
| `shape-studio` | Draw random squares and diamonds; move or reset them | Swing, polymorphism, geometry |
| `town-ranking` | Rank synthetic towns by population or density | Interfaces, comparator strategies, collections |
| `penpals` | Suggest the member with the closest interests | Encapsulation, arrays, Manhattan distance |
| `payments` | Calculate pay and search payment references | Objects, getters, array search |
| `national-insurance` | Apply the fixed bands from a coursework exercise | Collections, banded calculations |
| `verb-reader` | Read verb mappings and combine two forms | File handling, method overloading |
| `console` | Parcel checks, jug puzzle, statistics and vowel pairs | Input, conditions, loops, strings |

## Run an application

Use JDK 17 or later. There are no third-party dependencies. Open a terminal inside one application folder, such as `penpals`, then run:

```sh
javac -encoding UTF-8 *.java
java Main
```

Compile each application separately: they deliberately have their own `Main` classes. For the smaller exercises, open the individual folder inside `console` first. Run `verb-reader` from its own folder so it can find `verbs.txt`. The shapes application needs a graphical desktop; arrows move shapes in screen coordinates and Reset makes a new arrangement. Circles are implemented in the shape model but the random GUI creates squares and diamonds.

The console exercises expect numeric input where requested. Vowel pairs counts adjacent vowel letters, including overlapping pairs; it is not a linguistic diphthong detector. Shape hit tests exclude points on the boundary.

## Where the code came from

Based on my recovered coursework snippets. This portfolio edition was assembled with AI assistance to remove comments, recover the file layout and make the examples runnable. It includes newly written demonstration entry points for flowcharts, payments and town ranking, plus the missing `KShape`, `ShapePanel` and town interfaces. The PenPals method signature was restored, deletion and capacity checks were added, and suggestion arithmetic was widened. Other small changes fix GUI movement and Swing startup, separate combined verb output, avoid integer overflow in statistics and reject invalid parcel dimensions. Supplied flowchart versions were consolidated into one abstract-node implementation.

The National Insurance figures are fixed exercise values, not maintained payroll rules. Town figures and demonstration people are synthetic. The verb combiner is a narrow coursework string transformation, not a general Japanese translator. Connect Four and Minesweeper are not included because their source files have not been recovered.

## What I want to improve

I'd like to develop stronger input validation, explore money calculations with `BigDecimal`, and extend the shape interface so drawing does not depend on checking each concrete type. These are future improvements, not implemented features.

This is a learning portfolio, with small exercises kept alongside the larger object-oriented examples to show the progression.

## Verification

All 11 application folders compiled on OpenJDK 17. Validation covered 15 console scenarios and seven temporary behavioural harnesses, including both flowchart branches, PenPals deletion and capacity, payment lookup, ranking, NI band boundaries, missing verb mappings and shape geometry. Swing panel rendering was checked headlessly; the full window was not interactively tested.
