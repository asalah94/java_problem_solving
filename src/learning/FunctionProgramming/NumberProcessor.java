package learning.FunctionProgramming;

import java.util.List;

@FunctionalInterface
interface NumberProcessor {
    int process(List<Integer> numbers);
}

