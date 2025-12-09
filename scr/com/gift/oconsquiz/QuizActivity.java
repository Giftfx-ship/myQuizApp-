int index = 0;
int score = 0;

void loadQuestion() {
    questionText.setText(questions[index][0]);
    optionA.setText(questions[index][1]);
    optionB.setText(questions[index][2]);
    optionC.setText(questions[index][3]);
    optionD.setText(questions[index][4]);
}

View.OnClickListener answerClick = v -> {
    Button b = (Button) v;

    if (b.getText().toString().equals(questions[index][5])) {
        score++;
    }

    index++;

    if (index == questions.length) {
        Intent i = new Intent(QuizActivity.this, ResultActivity.class);
        i.putExtra("score", score);
        startActivity(i);
        finish();
    } else {
        loadQuestion();
    }
};

optionA.setOnClickListener(answerClick);
optionB.setOnClickListener(answerClick);
optionC.setOnClickListener(answerClick);
optionD.setOnClickListener(answerClick);

loadQuestion();

String[][] questions = {
    {"What is the longest bone in the body?", "Femur", "Tibia", "Humerus", "Fibula", "Femur"},
    {"Where is the cerebellum located?", "Brain", "Spine", "Heart", "Liver", "Brain"},
    {"How many ribs does the human body typically have?", "24", "20", "18", "30", "24"},
    {"The basic unit of life is?", "Cell", "Tissue", "Organ", "Nucleus", "Cell"},
    {"Where is the pituitary gland located?", "Brain", "Neck", "Chest", "Pelvis", "Brain"},
    {"Which organ filters blood?", "Kidney", "Liver", "Heart", "Pancreas", "Kidney"},
    {"What is the largest organ?", "Skin", "Liver", "Brain", "Lungs", "Skin"},
    {"Which blood cells fight infection?", "White cells", "Red cells", "Platelets", "Plasma", "White cells"},
    {"Where does digestion begin?", "Mouth", "Stomach", "Liver", "Colon", "Mouth"},
    {"What bone protects the brain?", "Skull", "Sternum", "Pelvis", "Clavicle", "Skull"},
    {"What part of the neuron receives signals?", "Dendrites", "Axon", "Myelin", "Synapse", "Dendrites"},
    {"Which muscle is involuntary?", "Cardiac", "Biceps", "Triceps", "Quadriceps", "Cardiac"},
    {"Where does gas exchange occur?", "Alveoli", "Bronchi", "Trachea", "Larynx", "Alveoli"},
    {"What is the smallest bone?", "Stapes", "Fibula", "Ulna", "Scapula", "Stapes"},
    {"Which organ makes insulin?", "Pancreas", "Liver", "Colon", "Stomach", "Pancreas"},
    {"Which artery is the largest?", "Aorta", "Femoral", "Carotid", "Radial", "Aorta"},
    {"What is the knee cap called?", "Patella", "Tibia", "Fibula", "Clavicle", "Patella"},
    {"Blood pH is around?", "7.4", "5.5", "8.2", "4.3", "7.4"},
    {"What is the voice box?", "Larynx", "Pharynx", "Trachea", "Bronchi", "Larynx"},
    {"Which organ stores bile?", "Gallbladder", "Liver", "Pancreas", "Stomach", "Gallbladder"},
    {"Which muscle helps breathing?", "Diaphragm", "Biceps", "Deltoid", "Triceps", "Diaphragm"},
    {"Bone cells are called?", "Osteocytes", "Neurons", "Myocytes", "Leukocytes", "Osteocytes"},
    {"What carries oxygen?", "Hemoglobin", "Plasma", "Platelets", "Lymph", "Hemoglobin"},
    {"Where are the adrenal glands?", "Kidneys", "Heart", "Lungs", "Skull", "Kidneys"},
    {"What protects the heart?", "Ribs", "Skull", "Femur", "Spine", "Ribs"},
    {"Which organ detoxifies?", "Liver", "Kidney", "Heart", "Spleen", "Liver"},
    {"How many chambers in the heart?", "4", "2", "3", "5", "4"},
    {"What connects muscles to bone?", "Tendon", "Ligament", "Cartilage", "Fascia", "Tendon"},
    {"What connects bone to bone?", "Ligament", "Tendon", "Muscle", "Cell", "Ligament"},
    {"Where is the thyroid gland?", "Neck", "Head", "Chest", "Back", "Neck"}
};
