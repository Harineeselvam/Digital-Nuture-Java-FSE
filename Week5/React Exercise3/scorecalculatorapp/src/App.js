import React from 'react';
import CalculateScore from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        studentName="Asha Kumar"
        school="Bright Future College"
        totalMarks={420}
        goal="90%"
        subjects={5}
      />
    </div>
  );
}

export default App;
