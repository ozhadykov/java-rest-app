package com.rest.app.setting_scores;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ScoreController {

    static Score score = new Score(30, 20, 10);

    @GetMapping("/health-check")
    public String getHealthCheck() {
        return "System is up and running";
    }

    @GetMapping("/score")
    public Score getScore() {
        return score;
    }

    @GetMapping("score/{scoreType}")
    public int getScoreTypeValue(@PathVariable String scoreType) {
        if (scoreType.equalsIgnoreCase("wins"))
            return score.getWins();
        if (scoreType.equalsIgnoreCase("loses"))
            return score.getLoses();
        return score.getTies();
    }

    @PostMapping("/score/{scoreType}")
    public Score increaseWins(@PathVariable String scoreType) {
        if (scoreType.equalsIgnoreCase("wins"))
            score.setWins(score.getWins() + 1);
        if (scoreType.equalsIgnoreCase("loses"))
            score.setWins(score.getLoses() + 1);
        if (scoreType.equalsIgnoreCase("ties"))
            score.setTies(score.getTies() + 1);
        return score;
    }

    @PatchMapping("score/{scoreType}")
    public Score updateScoreType(@PathVariable String scoreType, @RequestParam(name="new-value")int newValue) {
        if (scoreType.equalsIgnoreCase("wins"))
            score.setWins(newValue);
        if (scoreType.equalsIgnoreCase("loses"))
            score.setLoses(newValue);
        if (scoreType.equalsIgnoreCase("ties"))
            score.setTies(newValue);
        return score;
    }

    @PutMapping("/score")
    public Score updateScore(@RequestBody Score newScore) {
        score = newScore;
        return score;
    }

    @DeleteMapping("/score")
    public void deleteScore() {
        score = null;
    }


}
