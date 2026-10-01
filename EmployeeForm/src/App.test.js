import { render, screen } from '@testing-library/react';
import App from './App';

test('renders learn react link', () => {
  render(<App />);
  const linkElement = screen.getByText(/learn react/i);
  expect(linkElement).toBeInTheDocument();
});
form {
    display: flex;
    flex-direction: column;
    width: 300px;
    margin: 0 auto;
}

div {
    margin-bottom: 10px;
}

label {
    font-weight: bold;
}

input {
    padding: 8px;
    font-size: 16px;
}

button {
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    cursor: pointer;
}