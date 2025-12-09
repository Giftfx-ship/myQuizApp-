int score = getIntent().getIntExtra("score", 0);
scoreText.setText("Your Score: " + score + "/30");

restartButton.setOnClickListener(v -> {
    Intent i = new Intent(ResultActivity.this, QuizActivity.class);
    startActivity(i);
    finish();
});
