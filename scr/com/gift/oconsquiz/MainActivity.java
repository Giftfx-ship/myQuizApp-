startButton.setOnClickListener(v -> {
    Intent i = new Intent(MainActivity.this, QuizActivity.class);
    startActivity(i);
});

footerText.setOnClickListener(v -> {
    String url = "https://wa.me/2349164624021";
    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
    startActivity(i);
});
