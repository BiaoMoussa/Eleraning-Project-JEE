-- Create the "trainings" table
CREATE TABLE trainings (
  id SERIAL PRIMARY KEY,
  name TEXT UNIQUE NOT NULL
);

-- Create the "modules" table
CREATE TABLE modules (
  id SERIAL PRIMARY KEY,
  training_id INTEGER REFERENCES trainings(id),
  name TEXT UNIQUE NOT NULL,
  description TEXT NOT NULL,
  duration INTEGER NOT NULL,
  type CHAR(10) NOT NULL
);

-- Create the "courses" table
CREATE TABLE courses (
  id INTEGER PRIMARY KEY REFERENCES modules(id),
  nbr_of_students INTEGER NOT NULL,
  classroom CHAR(10) NOT NULL
);

-- Create the "tutorials" table
CREATE TABLE tutorials (
  id INTEGER PRIMARY KEY REFERENCES modules(id),
  video_link TEXT NOT NULL
);

-- Create the "projects" table
CREATE TABLE projects (
  id INTEGER PRIMARY KEY REFERENCES modules(id),
  nbr_of_groups INTEGER NOT NULL,
  nbr_of_students_per_group INTEGER NOT NULL
);

-- Insert some data into the "trainings" table
INSERT INTO trainings (name) VALUES ('Training 1');

-- Insert some data into the "modules" table
INSERT INTO modules (training_id, name, description, duration, type) VALUES (1, 'Module 1', 'Module 1 Description', 20, 'course');
INSERT INTO modules (training_id, name, description, duration, type) VALUES (1, 'Module 2', 'Module 2 Description', 4, 'tutorial');
INSERT INTO modules (training_id, name, description, duration, type) VALUES (1, 'Module 3', 'Module 3 Description', 30, 'project');

-- Insert some data into the "courses" table
INSERT INTO courses (id, nbr_of_students, classroom) VALUES (1, 25, 'R1');

-- Insert some data into the "tutorials" table
INSERT INTO tutorials (id, video_link) VALUES (2, 'https://www.example.com/tutorial1');

-- Insert some data into the "projects" table
INSERT INTO projects (id, nbr_of_groups, nbr_of_students_per_group) VALUES (3, 4, 5);
